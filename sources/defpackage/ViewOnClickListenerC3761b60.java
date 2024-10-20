package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3761b60 implements View.OnClickListener {
    public final View a;
    public ChipView g;
    public T8 h;
    public final Context i;
    public PK j;
    public final Runnable k;

    public ViewOnClickListenerC3761b60(Activity activity, View view, RunnableC4104c60 runnableC4104c60) {
        this.i = activity;
        this.a = view;
        this.k = runnableC4104c60;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.g) {
            EI2.h(1, 3, "ContextMenu.LensChip.Event");
            this.k.run();
            this.j.c.run();
        }
    }
}
