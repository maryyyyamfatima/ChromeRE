package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ol0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8449ol0 extends C6206iD0 {
    public final C6206iD0 i;
    public final C6206iD0 j;

    public C8449ol0(C6206iD0 c6206iD0, C6206iD0 c6206iD02) {
        super(null, -1, null);
        this.i = c6206iD0;
        this.j = c6206iD02;
    }

    @Override // defpackage.C6206iD0
    public final void d(Object obj) {
        this.i.d(obj);
        this.j.d(obj);
    }

    @Override // defpackage.C6206iD0, defpackage.SC0
    /* renamed from: e */
    public final boolean a(C6206iD0 c6206iD0) {
        if (this == c6206iD0) {
            return true;
        }
        if (c6206iD0 == null || c6206iD0.getClass() != C8449ol0.class) {
            return false;
        }
        C8449ol0 c8449ol0 = (C8449ol0) c6206iD0;
        return this.i.a(c8449ol0.i) && this.j.a(c8449ol0.j);
    }
}
