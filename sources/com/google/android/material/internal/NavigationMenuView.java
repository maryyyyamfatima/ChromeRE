package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.BS1;
import defpackage.CT1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements CT1 {
    @Override // defpackage.CT1
    public final void b(BS1 bs1) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        q0(new LinearLayoutManager(1, false));
    }
}
