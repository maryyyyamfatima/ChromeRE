package org.chromium.chrome.browser.keyboard_accessory.bar_component;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.C7928nE;
import defpackage.C8510ov1;
import defpackage.Ec4;
import defpackage.UN;
import java.util.WeakHashMap;
import org.chromium.ui.base.LocalizationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class KeyboardAccessoryView extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public RecyclerView a;
    public TabLayout g;
    public ViewPropertyAnimator h;
    public boolean i;
    public boolean j;

    public void a() {
    }

    public KeyboardAccessoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        sendAccessibilityEvent(32);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bar_items_view);
        this.a = recyclerView;
        getContext();
        recyclerView.q0(new LinearLayoutManager(0, false));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f34480_resource_name_obfuscated_res_0x7f080398);
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("AutofillKeyboardAccessory")) {
            recyclerView.g(new C8510ov1(dimensionPixelSize));
        }
        recyclerView.p0(null);
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView.setPaddingRelative(dimensionPixelSize, 0, 0, 0);
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        findViewById(R.id.accessory_bar_contents).setLayoutDirection(isLayoutRtl ? 1 : 0);
        this.a.setLayoutDirection(isLayoutRtl ? 1 : 0);
        setOnTouchListener(new View.OnTouchListener() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = KeyboardAccessoryView.k;
                KeyboardAccessoryView.this.performClick();
                return true;
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = KeyboardAccessoryView.k;
            }
        });
        setClickable(false);
        setSoundEffectsEnabled(false);
    }

    public void b(boolean z) {
        if (!z || getVisibility() != 0) {
            this.a.m0(0);
        }
        if (z) {
            bringToFront();
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            if (this.j) {
                this.h = null;
                setVisibility(0);
                return;
            } else {
                if (getVisibility() != 0) {
                    setAlpha(0.0f);
                }
                this.h = animate().alpha(1.0f).setDuration(150L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Runnable() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = KeyboardAccessoryView.k;
                        KeyboardAccessoryView.this.setVisibility(0);
                    }
                });
                announceForAccessibility(getContentDescription());
                return;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        if (this.i || this.j) {
            this.h = null;
            setVisibility(8);
        } else {
            this.h = animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setStartDelay(50L).setDuration(100L).withEndAction(new Runnable() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.l
                @Override // java.lang.Runnable
                public final void run() {
                    int i = KeyboardAccessoryView.k;
                    KeyboardAccessoryView.this.setVisibility(8);
                }
            });
        }
    }
}
