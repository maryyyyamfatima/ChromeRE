package org.chromium.third_party.android.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C6943kN1;
import defpackage.JE;
import defpackage.ViewOnClickListenerC6599jN1;
import defpackage.ViewOnClickListenerC7287lN1;
import defpackage.ViewOnClickListenerC7631mN1;
import java.util.Formatter;
import java.util.Locale;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaController extends FrameLayout {
    public JE a;
    public ViewGroup g;
    public SeekBar h;
    public TextView i;
    public TextView j;
    public boolean k;
    public boolean l;
    public boolean m;
    public StringBuilder n;
    public Formatter o;
    public ImageButton p;
    public ImageButton q;
    public ImageButton r;
    public ImageButton s;
    public ImageButton t;

    public MediaController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewOnClickListenerC6599jN1 viewOnClickListenerC6599jN1 = new ViewOnClickListenerC6599jN1(this);
        C6943kN1 c6943kN1 = new C6943kN1(this);
        ViewOnClickListenerC7287lN1 viewOnClickListenerC7287lN1 = new ViewOnClickListenerC7287lN1(this);
        ViewOnClickListenerC7631mN1 viewOnClickListenerC7631mN1 = new ViewOnClickListenerC7631mN1(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f58720_resource_name_obfuscated_res_0x7f0e017f, (ViewGroup) this, true);
        ImageButton imageButton = (ImageButton) findViewById(R.id.pause);
        this.p = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.p.setOnClickListener(viewOnClickListenerC6599jN1);
        }
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.ffwd);
        this.q = imageButton2;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(viewOnClickListenerC7631mN1);
            this.q.setVisibility(0);
        }
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.rew);
        this.r = imageButton3;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(viewOnClickListenerC7287lN1);
            this.r.setVisibility(0);
        }
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.next);
        this.s = imageButton4;
        if (imageButton4 != null) {
            imageButton4.setVisibility(8);
        }
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.prev);
        this.t = imageButton5;
        if (imageButton5 != null) {
            imageButton5.setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mediacontroller_progress_container);
        this.g = viewGroup;
        if (viewGroup != null) {
            SeekBar seekBar = (SeekBar) viewGroup.findViewById(R.id.mediacontroller_progress_bar);
            this.h = seekBar;
            if (seekBar != null) {
                seekBar.setOnSeekBarChangeListener(c6943kN1);
                this.h.setMax(1000);
            }
        }
        this.i = (TextView) findViewById(R.id.time);
        this.j = (TextView) findViewById(R.id.time_current);
        this.n = new StringBuilder();
        this.o = new Formatter(this.n, Locale.getDefault());
        ImageButton imageButton6 = this.s;
        if (imageButton6 != null) {
            imageButton6.setOnClickListener(null);
            this.s.setEnabled(this.l);
        }
        ImageButton imageButton7 = this.t;
        if (imageButton7 != null) {
            imageButton7.setOnClickListener(null);
            this.t.setEnabled(this.m);
        }
    }

    public final void b() {
        JE je = this.a;
        if (je == null) {
            return;
        }
        CafExpandedControllerActivity cafExpandedControllerActivity = je.a;
        long j = (cafExpandedControllerActivity.z.g() && cafExpandedControllerActivity.z.a.h.l()) ? 74L : 76L;
        boolean isEnabled = isEnabled();
        ImageButton imageButton = this.p;
        boolean z = false;
        if (imageButton != null) {
            imageButton.setEnabled(isEnabled && (((4 & j) > 0L ? 1 : ((4 & j) == 0L ? 0 : -1)) != 0 || ((2 & j) > 0L ? 1 : ((2 & j) == 0L ? 0 : -1)) != 0));
        }
        ImageButton imageButton2 = this.r;
        if (imageButton2 != null) {
            imageButton2.setEnabled(isEnabled && (8 & j) != 0);
        }
        ImageButton imageButton3 = this.q;
        if (imageButton3 != null) {
            imageButton3.setEnabled(isEnabled && (64 & j) != 0);
        }
        ImageButton imageButton4 = this.t;
        if (imageButton4 != null) {
            boolean z2 = (32 & j) != 0;
            this.m = z2;
            imageButton4.setEnabled(isEnabled && z2);
        }
        ImageButton imageButton5 = this.s;
        if (imageButton5 != null) {
            boolean z3 = (j & 16) != 0;
            this.l = z3;
            if (isEnabled && z3) {
                z = true;
            }
            imageButton5.setEnabled(z);
        }
    }

    public final String a(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        this.n.setLength(0);
        return i5 > 0 ? this.o.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString() : this.o.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }

    public final void d() {
        JE je = this.a;
        if (je == null || this.k) {
            return;
        }
        long a = je.a();
        CafExpandedControllerActivity cafExpandedControllerActivity = this.a.a;
        long j = !cafExpandedControllerActivity.z.g() ? 0L : cafExpandedControllerActivity.z.f.a.a;
        if (j <= 0) {
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        } else if (this.h != null) {
            ViewGroup viewGroup2 = this.g;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            int i = (int) ((1000 * a) / j);
            this.h.setProgress(i);
            this.h.setSecondaryProgress(i);
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(a((int) j));
        }
        TextView textView2 = this.j;
        if (textView2 != null) {
            textView2.setText(a((int) a));
        }
    }

    public final void c() {
        JE je = this.a;
        if (je == null || this.p == null) {
            return;
        }
        CafExpandedControllerActivity cafExpandedControllerActivity = je.a;
        if (!cafExpandedControllerActivity.z.g() ? false : cafExpandedControllerActivity.z.a.h.l()) {
            this.p.setImageResource(android.R.drawable.ic_media_pause);
        } else {
            this.p.setImageResource(android.R.drawable.ic_media_play);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        b();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MediaController.class.getName());
    }
}
