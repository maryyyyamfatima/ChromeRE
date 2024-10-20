package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Us1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2691Us1 {
    public static Object a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }
}
