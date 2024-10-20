package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YF0 {
    public static C5563gM0 b(Object obj) {
        return ((MX0) obj).j;
    }

    public static int a(Map.Entry entry) {
        return ((NX0) entry.getKey()).a;
    }

    public static void d(LV lv, Map.Entry entry) {
        NX0 nx0 = (NX0) entry.getKey();
        nx0.getClass();
        int ordinal = nx0.g.ordinal();
        int i = nx0.a;
        switch (ordinal) {
            case 0:
                lv.c(((Double) entry.getValue()).doubleValue(), i);
                return;
            case 1:
                lv.g(i, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                lv.j(i, ((Long) entry.getValue()).longValue());
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                lv.q(i, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                lv.i(i, ((Integer) entry.getValue()).intValue());
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                lv.f(i, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                lv.e(i, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                lv.a(i, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                lv.a.M(i, (String) entry.getValue());
                return;
            case 9:
                lv.h(i, C7931nE2.c.b(entry.getValue().getClass()), entry.getValue());
                return;
            case 10:
                lv.k(i, C7931nE2.c.b(entry.getValue().getClass()), entry.getValue());
                return;
            case 11:
                lv.b(i, (AbstractC4147cE) entry.getValue());
                return;
            case 12:
                lv.p(i, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                lv.i(i, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                lv.l(i, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                lv.m(i, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                lv.n(i, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                lv.o(i, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    public static Object c(FH2 fh2, OX0 ox0, XF0 xf0, C5563gM0 c5563gM0, Object obj, A14 a14) {
        Object valueOf;
        Object c;
        NX0 nx0 = ox0.d;
        int i = nx0.a;
        EnumC10540uq4 enumC10540uq4 = nx0.g;
        if (enumC10540uq4 == EnumC10540uq4.n) {
            fh2.F();
            nx0.getClass();
            throw null;
        }
        int ordinal = enumC10540uq4.ordinal();
        MessageLite messageLite = ox0.c;
        switch (ordinal) {
            case 0:
                valueOf = Double.valueOf(fh2.readDouble());
                break;
            case 1:
                valueOf = Float.valueOf(fh2.readFloat());
                break;
            case 2:
                valueOf = Long.valueOf(fh2.M());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                valueOf = Long.valueOf(fh2.c());
                break;
            case 4:
                valueOf = Integer.valueOf(fh2.F());
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                valueOf = Long.valueOf(fh2.d());
                break;
            case 6:
                valueOf = Integer.valueOf(fh2.h());
                break;
            case 7:
                valueOf = Boolean.valueOf(fh2.i());
                break;
            case 8:
                valueOf = fh2.w();
                break;
            case 9:
                valueOf = fh2.L(messageLite.getClass(), xf0);
                break;
            case 10:
                valueOf = fh2.a(messageLite.getClass(), xf0);
                break;
            case 11:
                valueOf = fh2.D();
                break;
            case 12:
                valueOf = Integer.valueOf(fh2.m());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                valueOf = Integer.valueOf(fh2.H());
                break;
            case 15:
                valueOf = Long.valueOf(fh2.k());
                break;
            case 16:
                valueOf = Integer.valueOf(fh2.t());
                break;
            case 17:
                valueOf = Long.valueOf(fh2.u());
                break;
            default:
                valueOf = null;
                break;
        }
        nx0.getClass();
        int ordinal2 = nx0.g.ordinal();
        if ((ordinal2 == 9 || ordinal2 == 10) && (c = c5563gM0.c(nx0)) != null) {
            valueOf = AbstractC1507Lp1.b(c, valueOf);
        }
        c5563gM0.k(nx0, valueOf);
        return obj;
    }
}
