package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vH1 */
/* loaded from: classes.dex */
public final class C10689vH1 implements InterfaceC9395rX {
    public static final C6492j31 a = C6492j31.k("com/google/chrome/elements/command/LogInteractionCommandHandler");

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        return new C6657jZ(new H4((C11032wH1) obj) { // from class: uH1
            @Override // defpackage.H4
            public final void run() {
                InterfaceC8177nx0 interfaceC8177nx0 = ((C2924Wn) AbstractC9053qX.this).f;
                ((InterfaceC5462g31) C10689vH1.a.f().g("com/google/chrome/elements/command/LogInteractionCommandHandler", 32, "lambda$onCommand$0", "LogInteractionCommandHandler.java")).h("Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging");
                throw new IllegalArgumentException("CommandHandler requires an XUiKitElementBuilder.");
            }
        });
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C11032wH1.m;
    }
}
