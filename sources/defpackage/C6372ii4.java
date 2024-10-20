package defpackage;

import com.google.vr.ndk.base.Version;
import com.google.vr.vrcore.base.api.VrCoreUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ii4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6372ii4 {
    public static int a() {
        try {
            return !Version.parse(VrCoreUtils.b(V60.a)).isAtLeast(Version.parse("1.130.0")) ? 2 : 3;
        } catch (C6029hi4 unused) {
            AbstractC4851eH1.d("VrCoreVersionChecker", "Unable to find VrCore.", new Object[0]);
            return AbstractC4983eg2.c(V60.a, "com.google.vr.vrcore") != -1 ? 2 : 1;
        } catch (SecurityException e) {
            AbstractC4851eH1.a("VrCoreVersionChecker", "Cannot query VrCore version: " + e.toString(), new Object[0]);
            return 1;
        }
    }
}
