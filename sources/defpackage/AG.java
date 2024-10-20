package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AG extends WZ {

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float D;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float E;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float F;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int G;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_SIZE)
    float H;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int I;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 2;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return new BG();
    }

    public AG() {
        super("CardShadow");
        this.E = -1.0f;
        this.F = -1.0f;
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || AG.class != wz.getClass()) {
            return false;
        }
        AG ag = (AG) wz;
        return Float.compare(this.D, ag.D) == 0 && Float.compare(this.E, ag.E) == 0 && Float.compare(this.F, ag.F) == 0 && this.G == ag.G && Float.compare(this.H, ag.H) == 0 && this.I == ag.I;
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        BG bg = (BG) obj;
        int i = this.I;
        int i2 = this.G;
        float f = this.D;
        float f2 = this.H;
        float f3 = this.E;
        float f4 = this.F;
        if (bg.a != i) {
            bg.a = i;
            bg.o = true;
            bg.invalidateSelf();
        }
        if (bg.b != i2) {
            bg.b = i2;
            bg.o = true;
            bg.invalidateSelf();
        }
        float f5 = (int) (f + 0.5f);
        if (bg.i != f5) {
            bg.i = f5;
            bg.o = true;
            bg.invalidateSelf();
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = BG.b(f2);
        if (bg.j != b) {
            bg.j = b;
            bg.o = true;
            bg.invalidateSelf();
        }
        bg.m = false;
        bg.n = false;
        if (f3 != bg.k) {
            bg.k = f3;
            bg.o = true;
            bg.invalidateSelf();
        }
        if (f4 == bg.l) {
            return;
        }
        bg.l = f4;
        bg.o = true;
        bg.invalidateSelf();
    }
}
