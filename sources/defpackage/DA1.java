package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface DA1 {
    void c(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback h(Class cls, String str);

    Activity j();

    void startActivityForResult(Intent intent, int i);
}
