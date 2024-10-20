package org.chromium.services.device;

import defpackage.A42;
import defpackage.AbstractC0115Ax;
import defpackage.AbstractC10647v90;
import defpackage.AbstractC5157f94;
import defpackage.C0077Ap1;
import defpackage.C11445xV1;
import defpackage.C9547rx;
import defpackage.C9590s42;
import defpackage.T84;
import defpackage.W14;
import org.chromium.device.nfc.NfcDelegate;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InterfaceRegistrar {
    public static void createInterfaceRegistryForContext(long j, NfcDelegate nfcDelegate) {
        CoreImpl coreImpl = AbstractC10647v90.a;
        coreImpl.getClass();
        C0077Ap1 e = C0077Ap1.e(new C11445xV1(new W14(coreImpl, j)));
        e.c(AbstractC0115Ax.a, new C9547rx());
        e.c(A42.a, new C9590s42(nfcDelegate));
        e.c(AbstractC5157f94.a, new T84());
    }
}
