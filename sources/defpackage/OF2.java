package defpackage;

import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OF2 extends AbstractC0185Bl {
    public final /* synthetic */ PF2 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return new C4034bu(new C5408fu(this.h.a, new BarcodeDetectorOptions()));
    }

    public OF2(PF2 pf2) {
        this.h = pf2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.h.e = (C4034bu) obj;
    }
}
