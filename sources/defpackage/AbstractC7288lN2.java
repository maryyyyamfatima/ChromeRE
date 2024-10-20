package defpackage;

import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lN2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7288lN2 {
    public static void a(Object obj) {
        if (obj instanceof InterfaceC10392uQ2) {
            ((C11703yE1) ((InterfaceC10392uQ2) obj)).x();
            return;
        }
        if (obj instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) obj;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i));
            }
        }
    }
}
