package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9733sW {
    public static C9390rW a(Collection collection, InterfaceC6808jy2 interfaceC6808jy2) {
        if (collection instanceof C9390rW) {
            C9390rW c9390rW = (C9390rW) collection;
            return new C9390rW(c9390rW.a, new C7840my2(Arrays.asList(c9390rW.g, interfaceC6808jy2)));
        }
        return new C9390rW(collection, interfaceC6808jy2);
    }
}
