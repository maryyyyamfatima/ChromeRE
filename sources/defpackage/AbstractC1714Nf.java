package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1714Nf {
    public static void a(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
