package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EC1 extends c {
    public final Handler b0 = new Handler();
    public final CC1 c0 = new CC1(this);
    public final DC1 d0 = new DC1(this);
    public ListAdapter e0;
    public ListView f0;
    public View g0;
    public View h0;
    public View i0;
    public boolean j0;

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context B0 = B0();
        FrameLayout frameLayout = new FrameLayout(B0);
        LinearLayout linearLayout = new LinearLayout(B0);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(B0, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(B0);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(B0);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(B0);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.c
    public void v0(View view, Bundle bundle) {
        L0();
    }

    @Override // androidx.fragment.app.c
    public final void k0() {
        this.b0.removeCallbacks(this.c0);
        this.f0 = null;
        this.j0 = false;
        this.i0 = null;
        this.h0 = null;
        this.g0 = null;
        this.f11484J = true;
    }

    public final void M0(ListAdapter listAdapter) {
        boolean z = this.e0 != null;
        this.e0 = listAdapter;
        ListView listView = this.f0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.j0 || z) {
                return;
            }
            N0(true, C0().getWindowToken() != null);
        }
    }

    public final void N0(boolean z, boolean z2) {
        L0();
        View view = this.h0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.j0 == z) {
            return;
        }
        this.j0 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(K(), R.anim.fade_out));
                this.i0.startAnimation(AnimationUtils.loadAnimation(K(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.i0.clearAnimation();
            }
            this.h0.setVisibility(8);
            this.i0.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(K(), R.anim.fade_in));
            this.i0.startAnimation(AnimationUtils.loadAnimation(K(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.i0.clearAnimation();
        }
        this.h0.setVisibility(0);
        this.i0.setVisibility(8);
    }

    public final void L0() {
        if (this.f0 != null) {
            return;
        }
        View view = this.L;
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f0 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.g0 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.h0 = view.findViewById(16711682);
            this.i0 = view.findViewById(16711683);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            ListView listView = (ListView) findViewById;
            this.f0 = listView;
            View view2 = this.g0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.j0 = true;
        this.f0.setOnItemClickListener(this.d0);
        ListAdapter listAdapter = this.e0;
        if (listAdapter != null) {
            this.e0 = null;
            M0(listAdapter);
        } else if (this.h0 != null) {
            N0(false, false);
        }
        this.b0.post(this.c0);
    }
}
