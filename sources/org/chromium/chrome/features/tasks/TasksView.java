package org.chromium.chrome.features.tasks;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.AbstractC9771sd;
import defpackage.C10780vZ2;
import defpackage.C5153f90;
import defpackage.C7942nG3;
import defpackage.C8646pK0;
import defpackage.Ec4;
import defpackage.InterfaceC7406lj1;
import defpackage.QZ3;
import java.util.WeakHashMap;
import org.chromium.components.browser_ui.widget.CoordinatorLayoutForPointer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TasksView extends CoordinatorLayoutForPointer {
    public final Context D;
    public FrameLayout E;
    public AppBarLayout F;
    public C10780vZ2 G;
    public InterfaceC7406lj1 H;
    public View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11535J;
    public CompoundButton.OnCheckedChangeListener K;
    public int L;
    public View.OnClickListener M;
    public QZ3 N;

    public TasksView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = 0;
        this.D = context;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.E = (FrameLayout) findViewById(R.id.carousel_tab_switcher_container);
        this.G = new C10780vZ2(getContext(), this);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.task_surface_header);
        this.F = appBarLayout;
        C5153f90 c5153f90 = (C5153f90) appBarLayout.getLayoutParams();
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
        behavior.o = new C7942nG3();
        c5153f90.b(behavior);
        QZ3 qz3 = new QZ3(this);
        this.N = qz3;
        C8646pK0.d((Activity) this.D, this.F, qz3);
        TextView textView = (TextView) findViewById(R.id.tab_switcher_title_description);
        TextView textView2 = (TextView) findViewById(R.id.more_tabs);
        AbstractC9771sd.i(R.style.f102500_resource_name_obfuscated_res_0x7f150437, textView);
        AbstractC9771sd.i(R.style.f100130_resource_name_obfuscated_res_0x7f15034a, textView2);
        int paddingStart = textView.getPaddingStart();
        int paddingTop = textView.getPaddingTop();
        int paddingEnd = textView.getPaddingEnd();
        int paddingBottom = textView.getPaddingBottom();
        WeakHashMap weakHashMap = Ec4.a;
        textView.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.N.c();
    }
}
