const prev=document.querySelector('.ante');
const next=document.querySelector('.post');
const slyder=document.querySelector('.cards-pc');
prev.addEventListener('click',()=>{
    slyder.scrollLeft-=250;
})
next.addEventListener('click',()=>{
    slyder.scrollLeft+=250;
})
const prev2=document.querySelector('.ante2');
const next2=document.querySelector('.post2');
const slyder2=document.querySelector('.cards-pc2');
prev2.addEventListener('click',()=>{
    slyder2.scrollLeft-=250;
})
next2.addEventListener('click',()=>{
    slyder2.scrollLeft+=250;
})