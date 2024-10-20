package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tS2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC10059tS2 implements InterfaceC0467Dp1 {
    g("DEFAULT"),
    h("BORDER"),
    i("STICKER"),
    j("GRID"),
    k("BRUSH_TEXTURE"),
    l("BACKGROUND"),
    m("PHOTO"),
    n("WINDING_BRUSH_TEXTURE");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    public static EnumC10059tS2 b(int i2) {
        switch (i2) {
            case 0:
                return g;
            case 1:
                return h;
            case 2:
                return i;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return j;
            case 4:
                return k;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                return m;
            case 7:
                return n;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC10059tS2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC10059tS2(String str) {
        this.a = r2;
    }
}
