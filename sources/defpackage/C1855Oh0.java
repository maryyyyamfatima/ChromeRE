package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1855Oh0 implements InterfaceC11007wC1 {
    public final C4722du1 a;
    public InterfaceC11007wC1 b;

    public C1855Oh0(C4722du1 c4722du1) {
        this.a = c4722du1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.b = interfaceC11007wC1;
        return interfaceC11007wC1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        InterfaceC11007wC1 interfaceC11007wC1 = this.b;
        if (interfaceC11007wC1 == null) {
            return;
        }
        Collections.sort(arrayList, new Comparator() { // from class: Nh0
            /* JADX WARN: Code restructure failed: missing block: B:66:0x002f, code lost:            r1 = -1;     */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:            if (r1.b <= r5.b) goto L14;     */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x002d, code lost:            if (r1 != null) goto L14;     */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:            r1 = 1;     */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final int compare(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 218
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C1725Nh0.compare(java.lang.Object, java.lang.Object):int");
            }
        });
        interfaceC11007wC1.b(arrayList);
    }
}
