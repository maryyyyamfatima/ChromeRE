package defpackage;

import android.os.Process;
import java.util.Arrays;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vj4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10841vj4 implements AndroidPermissionDelegate {
    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean canRequestPermission(String str) {
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final /* synthetic */ boolean e(String str) {
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean f(int i, String[] strArr, int[] iArr) {
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean h(String str) {
        return false;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean hasPermission(String str) {
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, str) == 0;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final void b(String[] strArr, InterfaceC0218Br2 interfaceC0218Br2) {
        int[] iArr = new int[strArr.length];
        Arrays.fill(iArr, -1);
        interfaceC0218Br2.b(iArr, strArr);
    }
}
