package org.chromium.ui.permissions;

import defpackage.InterfaceC0218Br2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface AndroidPermissionDelegate {
    void b(String[] strArr, InterfaceC0218Br2 interfaceC0218Br2);

    boolean canRequestPermission(String str);

    boolean e(String str);

    boolean f(int i, String[] strArr, int[] iArr);

    boolean h(String str);

    boolean hasPermission(String str);
}
