package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bf3 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0159Bf3 extends AbstractActivityC4038bu3 implements InterfaceC0809Gf3 {
    public ViewOnClickListenerC1069If3 B;

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT <= 26) {
            getWindow().clearFlags(Integer.MIN_VALUE);
        }
        this.B = new ViewOnClickListenerC1069If3(this, (ViewGroup) findViewById(R.id.content), null);
    }

    @Override // defpackage.InterfaceC0809Gf3
    public final ViewOnClickListenerC1069If3 z() {
        return this.B;
    }
}
