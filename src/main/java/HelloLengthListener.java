public class HelloLengthListener extends HelloBaseListener {
    @Override
    public void exitR(HelloParser.RContext ctx) {
        System.out.println("Listener :" + ctx.ID().getText().length());
    }
}
