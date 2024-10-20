package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ms, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7802ms extends AbstractC11826yc2 {
    public final /* synthetic */ InterfaceC8146ns c;
    public final /* synthetic */ C0143Bc2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7802ms(InterfaceC8146ns interfaceC8146ns, C0143Bc2 c0143Bc2) {
        super(true);
        this.c = interfaceC8146ns;
        this.d = c0143Bc2;
    }

    @Override // defpackage.AbstractC11826yc2
    public final void a() {
        if (this.c.onBackPressed()) {
            return;
        }
        this.a = false;
        this.d.c();
    }
}
