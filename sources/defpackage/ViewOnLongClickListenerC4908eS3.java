package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.chrome.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eS3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC4908eS3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC4908eS3 p;
    public static ViewOnLongClickListenerC4908eS3 q;
    public final View a;
    public final CharSequence g;
    public final int h;
    public final RunnableC4221cS3 i = new Runnable() { // from class: cS3
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC4908eS3.this.c(false);
        }
    };
    public final RunnableC4565dS3 j = new Runnable() { // from class: dS3
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC4908eS3.this.a();
        }
    };
    public int k;
    public int l;
    public C5252fS3 m;
    public boolean n;
    public boolean o;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cS3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dS3] */
    public ViewOnLongClickListenerC4908eS3(CharSequence charSequence, View view) {
        int scaledTouchSlop;
        this.a = view;
        this.g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = Jc4.a;
        if (Build.VERSION.SDK_INT < 28) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        } else {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
        }
        this.h = scaledTouchSlop;
        this.o = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.k = view.getWidth() / 2;
        this.l = view.getHeight() / 2;
        c(true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            fS3 r5 = r4.m
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.n
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.a
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.o = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            fS3 r5 = r4.m
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.o
            if (r1 != 0) goto L69
            int r1 = r4.k
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.h
            if (r1 > r2) goto L69
            int r1 = r4.l
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.k = r5
            r4.l = r6
            r4.o = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnLongClickListenerC4908eS3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public final void c(boolean z) {
        int height;
        int i;
        String str;
        int i2;
        String str2;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap weakHashMap = Ec4.a;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            ViewOnLongClickListenerC4908eS3 viewOnLongClickListenerC4908eS3 = q;
            if (viewOnLongClickListenerC4908eS3 != null) {
                viewOnLongClickListenerC4908eS3.a();
            }
            q = this;
            this.n = z;
            C5252fS3 c5252fS3 = new C5252fS3(view.getContext());
            this.m = c5252fS3;
            int i3 = this.k;
            int i4 = this.l;
            boolean z2 = this.n;
            View view2 = c5252fS3.b;
            boolean z3 = view2.getParent() != null;
            Context context = c5252fS3.a;
            if (z3) {
                if (view2.getParent() != null) {
                    ((WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            c5252fS3.c.setText(this.g);
            WindowManager.LayoutParams layoutParams = c5252fS3.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f42520_resource_name_obfuscated_res_0x7f080819);
            if (view.getWidth() < dimensionPixelOffset) {
                i3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.f42510_resource_name_obfuscated_res_0x7f080818);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.f42550_resource_name_obfuscated_res_0x7f08081c : R.dimen.f42540_resource_name_obfuscated_res_0x7f08081b);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = c5252fS3.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c5252fS3.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c5252fS3.f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i5;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i5 + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[1];
                int i7 = ((i + i6) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.n) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC4565dS3 runnableC4565dS3 = this.j;
            view.removeCallbacks(runnableC4565dS3);
            view.postDelayed(runnableC4565dS3, j2);
        }
    }

    public final void a() {
        ViewOnLongClickListenerC4908eS3 viewOnLongClickListenerC4908eS3 = q;
        View view = this.a;
        if (viewOnLongClickListenerC4908eS3 == this) {
            q = null;
            C5252fS3 c5252fS3 = this.m;
            if (c5252fS3 != null) {
                View view2 = c5252fS3.b;
                if (view2.getParent() != null) {
                    ((WindowManager) c5252fS3.a.getSystemService("window")).removeView(view2);
                }
                this.m = null;
                this.o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (p == this) {
            b(null);
        }
        view.removeCallbacks(this.j);
    }

    public static void b(ViewOnLongClickListenerC4908eS3 viewOnLongClickListenerC4908eS3) {
        ViewOnLongClickListenerC4908eS3 viewOnLongClickListenerC4908eS32 = p;
        if (viewOnLongClickListenerC4908eS32 != null) {
            viewOnLongClickListenerC4908eS32.a.removeCallbacks(viewOnLongClickListenerC4908eS32.i);
        }
        p = viewOnLongClickListenerC4908eS3;
        if (viewOnLongClickListenerC4908eS3 != null) {
            viewOnLongClickListenerC4908eS3.a.postDelayed(viewOnLongClickListenerC4908eS3.i, ViewConfiguration.getLongPressTimeout());
        }
    }
}
