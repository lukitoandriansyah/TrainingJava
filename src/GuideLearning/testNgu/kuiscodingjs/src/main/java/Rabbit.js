class Rabbit extends Animal{

    constructor(name, age, isMammal) {
        super(name, age, isMammal);
        this.isMammal=true
    }

    eat() {
        return `${this.name} sedang makan!`;
    }
}

const myRabbit = new Rabbit("labi", 2)