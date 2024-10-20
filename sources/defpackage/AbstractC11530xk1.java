package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11530xk1 {
    public static boolean b() {
        Iterator it = C11187wk1.a().a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC10844vk1) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public static void a() {
        Iterator it = C11187wk1.a().a.iterator();
        while (it.hasNext()) {
            ((InterfaceC10844vk1) it.next()).a();
        }
    }
}
