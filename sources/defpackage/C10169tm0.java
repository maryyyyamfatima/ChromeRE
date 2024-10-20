package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10169tm0 extends AbstractDialogInterfaceOnClickListenerC10855vm0 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity g;
    public final /* synthetic */ int h;

    public C10169tm0(Activity activity, int i, Intent intent) {
        this.a = intent;
        this.g = activity;
        this.h = i;
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10855vm0
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.g.startActivityForResult(intent, this.h);
        }
    }
}
