package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9518rs extends AbstractC11826yc2 {
    public final /* synthetic */ C9861ss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9518rs(C9861ss c9861ss) {
        super(false);
        this.c = c9861ss;
    }

    @Override // defpackage.AbstractC11826yc2
    public final void a() {
        Boolean bool;
        int i = 0;
        while (true) {
            InterfaceC7458ls[] interfaceC7458lsArr = this.c.b;
            if (i >= interfaceC7458lsArr.length) {
                return;
            }
            InterfaceC7458ls interfaceC7458ls = interfaceC7458lsArr[i];
            if (interfaceC7458ls != null && (bool = (Boolean) ((C8385oa2) interfaceC7458ls.r()).g) != null && bool.booleanValue()) {
                interfaceC7458ls.h();
                C9861ss.c(i);
                return;
            }
            i++;
        }
    }
}
