package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: je4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6691je4 extends AbstractC7723me4 {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ C7035ke4 c;

    public C6691je4(C7035ke4 c7035ke4) {
        this.c = c7035ke4;
    }

    @Override // defpackage.AbstractC7723me4, defpackage.InterfaceC7379le4
    public final void c() {
        if (this.a) {
            return;
        }
        this.a = true;
        InterfaceC7379le4 interfaceC7379le4 = this.c.d;
        if (interfaceC7379le4 != null) {
            interfaceC7379le4.c();
        }
    }

    @Override // defpackage.InterfaceC7379le4
    public final void a() {
        int i = this.b + 1;
        this.b = i;
        C7035ke4 c7035ke4 = this.c;
        if (i == c7035ke4.a.size()) {
            InterfaceC7379le4 interfaceC7379le4 = c7035ke4.d;
            if (interfaceC7379le4 != null) {
                interfaceC7379le4.a();
            }
            this.b = 0;
            this.a = false;
            c7035ke4.e = false;
        }
    }
}
