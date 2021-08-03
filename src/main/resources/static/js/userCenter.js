const bottom = new Vue({
    el:'.bottom-box',
    data() {
        return {
            leftNav:['回复','主题','提及我','黑名单','设置'],
            isBlod:true,
            num:0,
            show1:true,
            show2:false,
            show3:false,
            show4:false,
            show5:false,
        }
    },
    methods: {
        log(index){
            console.log(index);
    },
    changeShow(index){
        if(index == 0){
            this.show1 = true
            this.show2 = false
            this.show3 = false
            this.show4 = false
            this.show5 = false
        }else if(index == 1){
            this.show1 = false
            this.show2 = true
            this.show3 = false
            this.show4 = false
            this.show5 = false
        }else if(index == 2){
            this.show1 = false
            this.show2 = false
            this.show3 = true
            this.show4 = false
            this.show5 = false
        }else if(index == 3){
            this.show1 = false
            this.show2 = false
            this.show3 = false
            this.show4 = true
            this.show5 = false
        }else if(index == 4){
            this.show1 = false
            this.show2 = false
            this.show3 = false
            this.show4 = false
            this.show5 = true
        }
    }
    
    }
})