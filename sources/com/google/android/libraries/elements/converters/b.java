package com.google.android.libraries.elements.converters;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import defpackage.A10;
import defpackage.AbstractC4924eW;
import defpackage.AbstractC6726jk3;
import defpackage.AbstractC9896sy0;
import defpackage.C0381Cy0;
import defpackage.C10817vf4;
import defpackage.C4581dW;
import defpackage.C5277fX3;
import defpackage.C5612gW;
import defpackage.C5872hF0;
import defpackage.C6206iD0;
import defpackage.C7849n00;
import defpackage.C8367oX;
import defpackage.C8705pW;
import defpackage.C9746sY2;
import defpackage.EnumC11068wO2;
import defpackage.H10;
import defpackage.I84;
import defpackage.InterfaceC4449d61;
import defpackage.InterfaceC6115hx0;
import defpackage.InterfaceC6894kD2;
import defpackage.InterfaceC8520ox0;
import defpackage.InterfaceC9061qY2;
import defpackage.InterfaceC9738sX;
import defpackage.InterfaceC9989tE2;
import defpackage.QP0;
import defpackage.SY;
import defpackage.U80;
import defpackage.UC0;
import defpackage.WZ;
import defpackage.YJ2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b extends WZ {
    public static final /* synthetic */ int X = 0;

    @SY(type = 6)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    CollectionDataSource E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C5612gW F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9738sX G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C8367oX I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    String f11499J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C0381Cy0 K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C5872hF0 L;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 N;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 O;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 P;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 Q;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AtomicReference R;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9989tE2 S;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C8705pW T;

    @SY(type = 13)
    H10 U;

    @SY(type = 13)
    InterfaceC6115hx0 V;

    @SY(type = 13)
    InterfaceC8520ox0 W;

    @Override // defpackage.AbstractC10593v00
    public final boolean o() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    public b() {
        super("Collection");
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new a();
    }

    @Override // defpackage.AbstractC10593v00
    public final void O(C5277fX3 c5277fX3) {
        if (c5277fX3 == null) {
            return;
        }
        this.U = (H10) c5277fX3.a(H10.class);
        this.V = (InterfaceC6115hx0) c5277fX3.a(InterfaceC6115hx0.class);
        this.W = (InterfaceC8520ox0) c5277fX3.a(InterfaceC8520ox0.class);
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        InterfaceC9989tE2 interfaceC9989tE2 = this.S;
        C5872hF0 c5872hF0 = this.L;
        C5612gW c5612gW = this.F;
        AtomicInteger atomicInteger = AbstractC4924eW.a;
        YJ2 yj2 = new YJ2();
        C4581dW c4581dW = new C4581dW(c5612gW, c7849n00.a, yj2);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        I84 i84 = null;
        InterfaceC9061qY2 interfaceC9061qY2 = interfaceC9989tE2 != null ? (InterfaceC9061qY2) interfaceC9989tE2.get() : null;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        if (c5872hF0 != null) {
            int b = c5872hF0.b(4);
            if ((b == 0 || c5872hF0.b.get(b + c5872hF0.a) == 0) ? false : true) {
                i84 = new I84();
            }
        }
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        a aVar = (a) this.z;
        aVar.b = yj2;
        aVar.e = interfaceC9061qY2;
        aVar.f = atomicBoolean2;
        aVar.c = atomicBoolean;
        aVar.a = c4581dW;
        aVar.g = i84;
        aVar.d = atomicInteger2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f5  */
    @Override // defpackage.AbstractC10593v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.WZ z(defpackage.C7849n00 r42) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.b.z(n00):WZ");
    }

    @Override // defpackage.AbstractC10593v00
    public final void w(C7849n00 c7849n00) {
        String str = this.f11499J;
        C8705pW c8705pW = this.T;
        a aVar = (a) this.z;
        YJ2 yj2 = aVar.b;
        AtomicBoolean atomicBoolean = aVar.c;
        AtomicInteger atomicInteger = AbstractC4924eW.a;
        if (str != null && yj2 != null) {
            c8705pW.getClass();
            YJ2 yj22 = (YJ2) C8705pW.c.put(str, yj2);
            if (yj22 != null) {
                C8705pW.d.remove(yj22.a());
            }
        }
        atomicBoolean.set(false);
    }

    @Override // defpackage.AbstractC10593v00
    public final void D() {
        String str = this.f11499J;
        C8705pW c8705pW = this.T;
        YJ2 yj2 = ((a) this.z).b;
        AtomicInteger atomicInteger = AbstractC4924eW.a;
        if (str != null) {
            c8705pW.getClass();
            HashMap hashMap = C8705pW.c;
            YJ2 yj22 = (YJ2) hashMap.get(str);
            if (yj22 == null || yj22 != yj2) {
                return;
            }
            hashMap.remove(str);
            C8705pW.d.remove(yj22.a());
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final Object i(C6206iD0 c6206iD0, Object obj) {
        RecyclerView a;
        int i = c6206iD0.g;
        Object[] objArr = c6206iD0.h;
        if (i == -1048037474) {
            A10.b((C7849n00) objArr[0], (UC0) obj);
            return null;
        }
        if (i != 1803022739) {
            return null;
        }
        InterfaceC4449d61 interfaceC4449d61 = c6206iD0.a;
        View view = ((C10817vf4) obj).b;
        b bVar = (b) interfaceC4449d61;
        C5612gW c5612gW = bVar.F;
        AtomicReference atomicReference = bVar.R;
        C0381Cy0 c0381Cy0 = bVar.K;
        a aVar = (a) bVar.z;
        YJ2 yj2 = aVar.b;
        AtomicBoolean atomicBoolean = aVar.f;
        AtomicInteger atomicInteger = AbstractC4924eW.a;
        if (atomicReference != null && atomicReference.get() != null && atomicBoolean.getAndSet(false)) {
            RecyclerView a2 = yj2.a();
            if (a2 != null) {
                boolean z = c5612gW.i() == 1;
                ((C9746sY2) ((InterfaceC9061qY2) atomicReference.get())).a(a2, z ? a2.getWidth() : 0, z ? 0 : a2.getHeight());
            }
            return null;
        }
        if (c0381Cy0 != null && (a = yj2.a()) != null) {
            c0381Cy0.j(a);
            a.setTag(R.id.elements_item_touch_helper, c0381Cy0);
        }
        return null;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        a aVar = (a) abstractC6726jk3;
        a aVar2 = (a) abstractC6726jk32;
        aVar2.a = aVar.a;
        aVar2.b = aVar.b;
        aVar2.c = aVar.c;
        aVar2.d = aVar.d;
        aVar2.e = aVar.e;
        aVar2.f = aVar.f;
        aVar2.g = aVar.g;
    }
}
