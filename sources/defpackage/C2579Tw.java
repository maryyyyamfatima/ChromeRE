package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2579Tw extends AbstractC3779b90 {
    public Nc4 a;
    public C2189Qw b;
    public boolean c;
    public int d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final C9522rs3 g = new C9522rs3(this);
    public final C2709Uw h = new C2709Uw(this);

    @Override // defpackage.AbstractC3779b90
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = Ec4.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            Ec4.j(view, 1048576);
            Ec4.g(view, 0);
            this.h.getClass();
            if (view instanceof Snackbar$SnackbarLayout) {
                Ec4.k(view, C5792h1.w, new C9865ss3(this));
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC3779b90
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        Nc4 nc4 = this.a;
        if (nc4 == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            nc4.a();
        }
        if (nc4.l == null) {
            nc4.l = VelocityTracker.obtain();
        }
        nc4.l.addMovement(motionEvent);
        C9522rs3 c9522rs3 = nc4.q;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g = nc4.g((int) x, (int) y);
            nc4.j(pointerId, x, y);
            nc4.m(g, pointerId);
            if ((nc4.h[pointerId] & 0) != 0) {
                c9522rs3.getClass();
            }
        } else if (actionMasked == 1) {
            if (nc4.a == 1) {
                nc4.h();
            }
            nc4.a();
        } else if (actionMasked == 2) {
            if (nc4.a == 1) {
                int i2 = nc4.c;
                if (((nc4.k & (1 << i2)) != 0 ? 1 : 0) != 0 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = nc4.f;
                    int i3 = nc4.c;
                    int i4 = (int) (x2 - fArr[i3]);
                    int i5 = (int) (y2 - nc4.g[i3]);
                    int left = nc4.r.getLeft() + i4;
                    nc4.r.getTop();
                    int left2 = nc4.r.getLeft();
                    int top = nc4.r.getTop();
                    if (i4 != 0) {
                        left = c9522rs3.a(nc4.r, left);
                        WeakHashMap weakHashMap = Ec4.a;
                        nc4.r.offsetLeftAndRight(left - left2);
                    }
                    if (i5 != 0) {
                        View view2 = nc4.r;
                        c9522rs3.getClass();
                        int top2 = view2.getTop();
                        View view3 = nc4.r;
                        int i6 = top2 - top;
                        WeakHashMap weakHashMap2 = Ec4.a;
                        view3.offsetTopAndBottom(i6);
                    }
                    if (i4 != 0 || i5 != 0) {
                        c9522rs3.b(nc4.r, left);
                    }
                }
            } else {
                int pointerCount = motionEvent.getPointerCount();
                for (int i7 = 0; i7 < pointerCount; i7++) {
                    int pointerId2 = motionEvent.getPointerId(i7);
                    if ((nc4.k & (1 << pointerId2)) != 0) {
                        float x3 = motionEvent.getX(i7);
                        float y3 = motionEvent.getY(i7);
                        float f = x3 - nc4.d[pointerId2];
                        nc4.i(pointerId2, f, y3 - nc4.e[pointerId2]);
                        if (nc4.a == 1) {
                            break;
                        }
                        View g2 = nc4.g((int) x3, (int) y3);
                        if (nc4.c(g2, f) && nc4.m(g2, pointerId2)) {
                            break;
                        }
                    }
                }
            }
            nc4.k(motionEvent);
        } else if (actionMasked == 3) {
            if (nc4.a == 1) {
                nc4.f(0.0f);
            }
            nc4.a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            nc4.j(pointerId3, x4, y4);
            if (nc4.a == 0) {
                nc4.m(nc4.g((int) x4, (int) y4), pointerId3);
                if ((nc4.h[pointerId3] & 0) != 0) {
                    c9522rs3.getClass();
                }
            } else {
                int i8 = (int) x4;
                int i9 = (int) y4;
                View view4 = nc4.r;
                if (view4 != null && i8 >= view4.getLeft() && i8 < view4.getRight() && i9 >= view4.getTop() && i9 < view4.getBottom()) {
                    r10 = 1;
                }
                if (r10 != 0) {
                    nc4.m(nc4.r, pointerId3);
                }
            }
        } else if (actionMasked == 6) {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (nc4.a == 1 && pointerId4 == nc4.c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (r10 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(r10);
                    if (pointerId5 != nc4.c) {
                        View g3 = nc4.g((int) motionEvent.getX(r10), (int) motionEvent.getY(r10));
                        View view5 = nc4.r;
                        if (g3 == view5 && nc4.m(view5, pointerId5)) {
                            i = nc4.c;
                            break;
                        }
                    }
                    r10++;
                }
                if (i == -1) {
                    nc4.h();
                }
            }
            nc4.d(pointerId4);
        }
        return true;
    }

    @Override // defpackage.AbstractC3779b90
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View g;
        C2709Uw c2709Uw = this.h;
        c2709Uw.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C1199Jf3 b = C1199Jf3.b();
                C1929Ow c1929Ow = c2709Uw.a;
                synchronized (b.a) {
                    if (b.c(c1929Ow)) {
                        C0939Hf3 c0939Hf3 = b.c;
                        if (c0939Hf3.c) {
                            c0939Hf3.c = false;
                            b.d(c0939Hf3);
                        }
                    }
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C1199Jf3 b2 = C1199Jf3.b();
            C1929Ow c1929Ow2 = c2709Uw.a;
            synchronized (b2.a) {
                if (b2.c(c1929Ow2)) {
                    C0939Hf3 c0939Hf32 = b2.c;
                    if (!c0939Hf32.c) {
                        c0939Hf32.c = true;
                        b2.b.removeCallbacksAndMessages(c0939Hf32);
                    }
                }
            }
        }
        boolean z = this.c;
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            z = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked2 == 1 || actionMasked2 == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = new Nc4(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        Nc4 nc4 = this.a;
        nc4.getClass();
        int actionMasked3 = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked3 == 0) {
            nc4.a();
        }
        if (nc4.l == null) {
            nc4.l = VelocityTracker.obtain();
        }
        nc4.l.addMovement(motionEvent);
        C9522rs3 c9522rs3 = nc4.q;
        if (actionMasked3 == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            nc4.j(pointerId, x, y);
            View g2 = nc4.g((int) x, (int) y);
            if (g2 == nc4.r && nc4.a == 2) {
                nc4.m(g2, pointerId);
            }
            if ((nc4.h[pointerId] & 0) != 0) {
                c9522rs3.getClass();
            }
        } else {
            if (actionMasked3 != 1) {
                if (actionMasked3 != 2) {
                    if (actionMasked3 != 3) {
                        if (actionMasked3 == 5) {
                            int pointerId2 = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            nc4.j(pointerId2, x2, y2);
                            int i = nc4.a;
                            if (i == 0) {
                                if ((nc4.h[pointerId2] & 0) != 0) {
                                    c9522rs3.getClass();
                                }
                            } else if (i == 2 && (g = nc4.g((int) x2, (int) y2)) == nc4.r) {
                                nc4.m(g, pointerId2);
                            }
                        } else if (actionMasked3 == 6) {
                            nc4.d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (nc4.d != null && nc4.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId3 = motionEvent.getPointerId(i2);
                        if ((nc4.k & (1 << pointerId3)) != 0) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - nc4.d[pointerId3];
                            float f2 = y3 - nc4.e[pointerId3];
                            View g3 = nc4.g((int) x3, (int) y3);
                            boolean c = nc4.c(g3, f);
                            if (c) {
                                int left = g3.getLeft();
                                int a = c9522rs3.a(g3, ((int) f) + left);
                                g3.getTop();
                                g3.getTop();
                                int width = g3.getWidth();
                                if (width == 0) {
                                    break;
                                }
                                if (width > 0 && a == left) {
                                    break;
                                }
                            }
                            nc4.i(pointerId3, f, f2);
                            if (nc4.a == 1) {
                                break;
                            }
                            if (c && nc4.m(g3, pointerId3)) {
                                break;
                            }
                        }
                    }
                    nc4.k(motionEvent);
                }
            }
            nc4.a();
        }
        return nc4.a == 1;
    }
}
