class Button {
    OnClickListener ocl;
    void setOnClickListener (OnClickListener ocl) {
        this.ocl = ocl;
    }
    interface OnClickListener {
        public abstract void onClick();
    }
    void onClick () {
        ocl.onClick();
    }
}
public class ButtonAPIExample {
    public static void main(String[] args) {
        // #1. 개발자 1. 클릭했을 때 음악재생
        Button btn1 = new Button();
    }
}
