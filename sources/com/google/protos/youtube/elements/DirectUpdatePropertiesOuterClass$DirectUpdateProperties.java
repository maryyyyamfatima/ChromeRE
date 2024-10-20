package com.google.protos.youtube.elements;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.C8275oE2;
import defpackage.C9984tD2;
import defpackage.EnumC10540uq4;
import defpackage.InterfaceC7327lV1;
import defpackage.JX0;
import defpackage.KX0;
import defpackage.OX0;
import defpackage.PX0;
import defpackage.QX0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DirectUpdatePropertiesOuterClass$DirectUpdateProperties extends QX0 implements InterfaceC7327lV1 {
    public static final DirectUpdatePropertiesOuterClass$DirectUpdateProperties k;
    public static volatile KX0 l;
    public static final OX0 m;
    public byte j = 2;

    public DirectUpdatePropertiesOuterClass$DirectUpdateProperties() {
        C8275oE2 c8275oE2 = C8275oE2.i;
    }

    @Override // defpackage.QX0
    public final Object n(PX0 px0, Object obj, Object obj2) {
        switch (px0.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return QX0.s(k, "\u0001\u0000", new Object[0]);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
            case 4:
                return new JX0(k);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return k;
            case 6:
                KX0 kx0 = l;
                if (kx0 == null) {
                    synchronized (DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class) {
                        kx0 = l;
                        if (kx0 == null) {
                            kx0 = new KX0(k);
                            l = kx0;
                        }
                    }
                }
                return kx0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
        k = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        QX0.u(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        m = QX0.t(C9984tD2.l, directUpdatePropertiesOuterClass$DirectUpdateProperties, directUpdatePropertiesOuterClass$DirectUpdateProperties, null, 402418170, EnumC10540uq4.k, DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class);
    }
}
