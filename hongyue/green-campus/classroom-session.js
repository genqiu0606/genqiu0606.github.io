/* Same-origin handoff for PPT launches. No answers or saved work are reset. */
(() => {
  if (!('BroadcastChannel' in window)) return;
  const channel = new BroadcastChannel('green-campus-ppt-session-v1');
  const id = crypto.randomUUID?.() || Math.random().toString(36);
  const valid = hash => /^#(home|words|practice|dictation|listening|review|task1|task2|time)(\?[^#]*)?$/.test(hash);
  let lastActive = Date.now();
  addEventListener('focus', () => lastActive = Date.now());
  channel.onmessage = ({data}) => {
    if (data?.type === 'probe') channel.postMessage({type:'available',request:data.request,id,lastActive});
    if (data?.type === 'navigate' && data.id === id && valid(data.hash)) {
      location.hash = data.hash;
      window.dispatchEvent(new Event("gc:navigate"));
      window.focus();
      channel.postMessage({type:'ack',request:data.request,id});
    }
  };
  window.name = 'GreenCampusClassroom';
})();
