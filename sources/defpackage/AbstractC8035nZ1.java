package defpackage;

import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8035nZ1 {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
