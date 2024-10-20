package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JU0 implements CA1 {
    public final InterfaceC3295Zj0 a;
    public final CA1 b;

    public JU0(InterfaceC3295Zj0 interfaceC3295Zj0, CA1 ca1) {
        this.a = interfaceC3295Zj0;
        this.b = ca1;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        int ordinal = enumC11340xA1.ordinal();
        InterfaceC3295Zj0 interfaceC3295Zj0 = this.a;
        switch (ordinal) {
            case 0:
                interfaceC3295Zj0.onCreate();
                break;
            case 1:
                interfaceC3295Zj0.b();
                break;
            case 2:
                interfaceC3295Zj0.onResume();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                interfaceC3295Zj0.onPause();
                break;
            case 4:
                interfaceC3295Zj0.a();
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                interfaceC3295Zj0.d(ja1);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        CA1 ca1 = this.b;
        if (ca1 != null) {
            ca1.c(ja1, enumC11340xA1);
        }
    }
}
