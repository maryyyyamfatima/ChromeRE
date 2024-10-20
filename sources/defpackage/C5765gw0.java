package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gw0 */
/* loaded from: classes.dex */
public final class C5765gw0 extends WZ {
    public static final /* synthetic */ int Q = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9738sX D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C8858pw0 F;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean G;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 f11509J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 L;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 N;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Map O;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    HZ3 P;

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    public C5765gw0() {
        super("EditableText");
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new C5421fw0();
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        boolean z = this.G;
        boolean z2 = this.H;
        AtomicInteger atomicInteger = AbstractC8515ow0.a;
        C7827mw0 c7827mw0 = new C7827mw0();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (z && z2) {
            AbstractC8530oz0.a(c7849n00.a);
        }
        AbstractC6726jk3 abstractC6726jk3 = this.z;
        ((C5421fw0) abstractC6726jk3).b = c7827mw0;
        ((C5421fw0) abstractC6726jk3).a = atomicBoolean;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043e  */
    @Override // defpackage.AbstractC10593v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.WZ z(defpackage.C7849n00 r31) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5765gw0.z(n00):WZ");
    }

    @Override // defpackage.AbstractC10593v00
    public final Object i(C6206iD0 c6206iD0, Object obj) {
        boolean z = true;
        switch (c6206iD0.g) {
            case -1974694341:
                C3870bR0 c3870bR0 = (C3870bR0) obj;
                InterfaceC4449d61 interfaceC4449d61 = c6206iD0.a;
                Object[] objArr = c6206iD0.h;
                QP0 qp0 = (QP0) objArr[1];
                QP0 qp02 = (QP0) objArr[2];
                View view = c3870bR0.a;
                boolean z2 = c3870bR0.b;
                C5765gw0 c5765gw0 = (C5765gw0) interfaceC4449d61;
                InterfaceC9738sX interfaceC9738sX = c5765gw0.D;
                U80 u80 = c5765gw0.E;
                AtomicInteger atomicInteger = AbstractC8515ow0.a;
                if (z2 && qp0 != null) {
                    ((C10081tX) interfaceC9738sX).a(qp0.a(), AbstractC8515ow0.a(view, ((C3184Yn) u80).v), 2).c();
                } else if (!z2 && qp02 != null) {
                    ((C10081tX) interfaceC9738sX).a(qp02.a(), AbstractC8515ow0.a(view, ((C3184Yn) u80).v), 2).c();
                }
                return null;
            case -1048037474:
                A10.b((C7849n00) c6206iD0.h[0], (UC0) obj);
                return null;
            case 378110312:
                C4853eH3 c4853eH3 = (C4853eH3) obj;
                InterfaceC4449d61 interfaceC4449d612 = c6206iD0.a;
                Object[] objArr2 = c6206iD0.h;
                QP0 qp03 = (QP0) objArr2[1];
                QP0 qp04 = (QP0) objArr2[2];
                EditText editText = c4853eH3.a;
                String str = c4853eH3.b;
                C5765gw0 c5765gw02 = (C5765gw0) interfaceC4449d612;
                InterfaceC9738sX interfaceC9738sX2 = c5765gw02.D;
                U80 u802 = c5765gw02.E;
                C7827mw0 c7827mw0 = ((C5421fw0) c5765gw02.z).b;
                AtomicInteger atomicInteger2 = AbstractC8515ow0.a;
                synchronized (c7827mw0) {
                    c7827mw0.a.add(0, str);
                }
                if (qp03 != null) {
                    ((C10081tX) interfaceC9738sX2).a(qp03.a(), AbstractC8515ow0.a(editText, ((C3184Yn) u802).v), 2).c();
                }
                if (TextUtils.isEmpty(str) && qp04 != null) {
                    ((C10081tX) interfaceC9738sX2).a(qp04.a(), AbstractC8515ow0.a(editText, ((C3184Yn) u802).v), 2).c();
                }
                return null;
            case 378376578:
                InterfaceC4449d61 interfaceC4449d613 = c6206iD0.a;
                Object[] objArr3 = c6206iD0.h;
                QP0 qp05 = (QP0) objArr3[1];
                TextView textView = ((C9886sw0) obj).a;
                C5765gw0 c5765gw03 = (C5765gw0) interfaceC4449d613;
                InterfaceC9738sX interfaceC9738sX3 = c5765gw03.D;
                U80 u803 = c5765gw03.E;
                AtomicInteger atomicInteger3 = AbstractC8515ow0.a;
                if (qp05 == null || textView == null) {
                    z = false;
                } else {
                    ((C10081tX) interfaceC9738sX3).a(qp05.a(), AbstractC8515ow0.a(textView, ((C3184Yn) u803).v), 2).c();
                }
                return Boolean.valueOf(z);
            case 1803022739:
                InterfaceC4449d61 interfaceC4449d614 = c6206iD0.a;
                final View view2 = ((C10817vf4) obj).c;
                C5765gw0 c5765gw04 = (C5765gw0) interfaceC4449d614;
                C8858pw0 c8858pw0 = c5765gw04.F;
                AtomicBoolean atomicBoolean = ((C5421fw0) c5765gw04.z).a;
                AtomicInteger atomicInteger4 = AbstractC8515ow0.a;
                if (c8858pw0.i() && (view2 instanceof EditText) && atomicBoolean.getAndSet(false)) {
                    view2.post(new Runnable() { // from class: lw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view3 = view2;
                            view3.requestFocus();
                            InputMethodManager inputMethodManager = (InputMethodManager) view3.getContext().getSystemService("input_method");
                            if (inputMethodManager != null) {
                                inputMethodManager.showSoftInput(view3, 1);
                            }
                        }
                    });
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        C5421fw0 c5421fw0 = (C5421fw0) abstractC6726jk3;
        C5421fw0 c5421fw02 = (C5421fw0) abstractC6726jk32;
        c5421fw02.a = c5421fw0.a;
        c5421fw02.b = c5421fw0.b;
    }
}
