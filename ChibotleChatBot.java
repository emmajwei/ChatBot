public class ChibotleChatBot {


  
    private String[] times;
    private String[] foodResp;
    private String[] locResp;
    private String[] drinks;
    private String[] thanks;
    private String[] confused;

    public ChibotleChatBot() {
        times = new String[] {
            "Chibotle is open from 10:00 AM to 10:00 PM Monday through Friday, and it is closed on weekends.",
            "We operate from 10 AM to 10 PM Monday-Friday; we are closed on weekends.",
            "Chibotle is open from 10 AM to 10 PM during the weekdays(Monday-Friday), but we are closed all weekend."
        };
 
 
        foodResp = new String[] {
            "Chibotle serves only burritos and bowls. You can choose your protein: chicken, steak, or just veggies. Both the burrito and bowl come with automatically beans and rice and your choice of protein, and that is it.",
            "We offer a variety of options, including burritos and bowls. You can get chicken, steak, or simply a vegetarian meal with veggies. Everything comes with rice, beans, and your choice of meat or veggies.",
            "At Chibotle, you can get burritos and bowls. You can pick your protein: chicken, steak, or just vegetarian veggies. It is served with rice, beans, and your choice of meat or veggies."
        };
 
 
        locResp = new String[] {
            "We have Chibotle locations at Pleasanton, Dublin, and Livermore.",
            "There are three Chibotle locations in the U.S.: Pleasanton, Dublin, and Livermore.",
            "Chibotle is available in many cities that range from Pleasanton, Dublin, and Livermore."
        };
        drinks = new String[] {
            "We have cups you may fill with fountain drinks, bottled water, chocolate milk, orange juice, and apple juice.",
            "At Chibotle, we offer fountain drinks, juices, bottled water, and chocolate milk",
            "We have a variety of options for beverages: fountain drinks, bottled water, chocolate milk, orange juice, and apple juice."
        };
        thanks = new String[] {
            "Thank you for visiting the Chibotle website. Hope you have a nice day!",
            "Thanks for using the Chibotle ChatBot. Have a nice day!",
            "Goodbye! Thanks for using the Chibotle ChatBot."
        };
        confused = new String[]{
            "Sorry, I don't understand. You can ask about our hours, menu, or locations. Bye to exit chat.",
            "I'm not sure what you are asking, please ask about our hours, menu, or locations. Bye to exit chat.",
            "Sorry, that is not part of my vocabulary. We only answer questions about hours, menu, or location. Bye to exit chat."
        };
    }
    public String getConfused(){
        return confused[(int) (Math.random() * confused.length)];
    }
    public String getThanks(){
        return thanks[(int) (Math.random() * thanks.length)];
    }
    public String getDrinks(){
        return drinks[(int) (Math.random() * drinks.length)];
    }
    public String getTimes() {
        return times[(int) (Math.random() * times.length)];
    }
    public String getFood() {
        return foodResp[(int) (Math.random() * foodResp.length)];
    }
    public String getLocation() {
        return locResp[(int) (Math.random() * locResp.length)];
    }
 }
 