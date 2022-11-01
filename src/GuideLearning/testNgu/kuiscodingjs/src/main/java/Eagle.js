class Eagle extends Animal{

    constructor(name, age, isMammal) {
        super(name, age, isMammal);
        this.isMammal=false
    }

    fly() {
        return `${this.name} sedang terbang!`;
    }
}

const myEagle = new Eagle("elo", 4)
