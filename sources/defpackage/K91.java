package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K91 extends WZ {
    public SparseArray D;
    public boolean E;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 45;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        return true;
    }

    @Override // defpackage.WZ
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        return this == wz;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 3;
    }

    @Override // defpackage.WZ, defpackage.SC0
    public final boolean a(Object obj) {
        return this == ((WZ) obj);
    }

    public K91() {
        super("HostComponent");
        this.E = false;
    }

    @Override // defpackage.AbstractC10593v00
    public final InterfaceC9750sZ1 C() {
        if (B10.g) {
            return new C0721Fo0();
        }
        return super.C();
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return new ComponentHost(new C7849n00(context, (String) null, (C5524gE1) null, (C5277fX3) null));
    }

    @Override // defpackage.AbstractC10593v00
    public final void d(C7849n00 c7849n00, Object obj) {
        x(c7849n00, obj);
    }

    @Override // defpackage.AbstractC10593v00
    public final void t(C7849n00 c7849n00, Object obj) {
        H(c7849n00, obj);
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        componentHost.setAlpha(1.0f);
        componentHost.B = this.E;
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
        componentHost.B = false;
    }

    @Override // defpackage.AbstractC10593v00
    public final void x(C7849n00 c7849n00, Object obj) {
        ((ComponentHost) obj).j();
    }

    @Override // defpackage.WZ
    public final SparseArray Y() {
        return this.D;
    }

    @Override // defpackage.WZ
    public final boolean e0() {
        SparseArray sparseArray = this.D;
        return sparseArray != null && sparseArray.size() > 0;
    }
}
