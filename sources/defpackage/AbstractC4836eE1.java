package defpackage;

import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4836eE1 {
    public static final Pattern a = Pattern.compile("(\\w+).*");

    public static String a(OL2 ol2) {
        if (ol2.isEmpty()) {
            return null;
        }
        return AbstractC4809e90.a("transform=", new C1007Ht1("+").b(ol2));
    }
}
