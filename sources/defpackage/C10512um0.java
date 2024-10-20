package defpackage;

import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: um0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10512um0 extends AbstractDialogInterfaceOnClickListenerC10855vm0 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ DA1 g;
    public final /* synthetic */ int h = 2;

    public C10512um0(Intent intent, DA1 da1) {
        this.a = intent;
        this.g = da1;
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10855vm0
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.g.startActivityForResult(intent, this.h);
        }
    }
}
