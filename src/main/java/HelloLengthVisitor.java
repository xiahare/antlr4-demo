public class HelloLengthVisitor extends HelloBaseVisitor<Integer> {
    @Override
    public Integer visitR(HelloParser.RContext ctx) {

        return ctx.ID().getText().length();
    }
}
