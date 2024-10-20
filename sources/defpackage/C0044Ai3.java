package defpackage;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryCardView;
import org.chromium.chrome.browser.explore_sites.StableScrollLayoutManager$SavedState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ai3 */
/* loaded from: classes.dex */
public final class C0044Ai3 extends LinearLayoutManager {
    public int E;
    public StableScrollLayoutManager$SavedState F;

    public C0044Ai3() {
        this.w = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int n(LK2 lk2) {
        int C = C();
        if (C <= 0) {
            return 0;
        }
        int i = this.o / C;
        this.E = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int p(LK2 lk2) {
        return Math.max((C() - 1) * this.E, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int o(LK2 lk2) {
        View r;
        if (x() <= 0) {
            return 0;
        }
        if (S0() == C() - 1) {
            return Math.max((C() - 1) * this.E, 0);
        }
        int R0 = R0();
        if (R0 == -1 || (r = r(R0)) == null) {
            return 0;
        }
        int top = r.getTop() - AbstractC12077zK2.N(r);
        int A = AbstractC12077zK2.A(r);
        int abs = A > 0 ? Math.abs((this.E * top) / A) : 0;
        if (abs == 0 && R0 > 0) {
            return (this.E * R0) - 1;
        }
        return (this.E * R0) + abs;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final Parcelable j0() {
        Parcelable j0 = super.j0();
        StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState = this.F;
        int i = 0;
        if (stableScrollLayoutManager$SavedState != null) {
            if (stableScrollLayoutManager$SavedState.g > -1) {
                return new StableScrollLayoutManager$SavedState(stableScrollLayoutManager$SavedState, (LinearLayoutManager.SavedState) j0);
            }
        }
        StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState2 = new StableScrollLayoutManager$SavedState((LinearLayoutManager.SavedState) j0);
        View B = B();
        ExploreSitesCategoryCardView exploreSitesCategoryCardView = null;
        if (B != null && RecyclerView.L(B).k == 0) {
            exploreSitesCategoryCardView = (ExploreSitesCategoryCardView) B;
        }
        if (exploreSitesCategoryCardView == null) {
            stableScrollLayoutManager$SavedState2.g = -1;
        } else {
            stableScrollLayoutManager$SavedState2.g = AbstractC12077zK2.J(exploreSitesCategoryCardView);
            if (exploreSitesCategoryCardView.h.getFocusedChild() != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= exploreSitesCategoryCardView.h.getChildCount()) {
                        break;
                    }
                    if (exploreSitesCategoryCardView.h.getChildAt(i2).hasFocus()) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            stableScrollLayoutManager$SavedState2.h = i;
        }
        return stableScrollLayoutManager$SavedState2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final void i0(Parcelable parcelable) {
        if (parcelable instanceof StableScrollLayoutManager$SavedState) {
            StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState = (StableScrollLayoutManager$SavedState) parcelable;
            this.F = stableScrollLayoutManager$SavedState;
            super.i0(stableScrollLayoutManager$SavedState.a);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final void h0(LK2 lk2) {
        View childAt;
        super.h0(lk2);
        StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState = this.F;
        if (stableScrollLayoutManager$SavedState != null) {
            int i = stableScrollLayoutManager$SavedState.g;
            if (i > -1) {
                int i2 = stableScrollLayoutManager$SavedState.h;
                View r = r(i);
                if (r != null) {
                    ExploreSitesCategoryCardView exploreSitesCategoryCardView = RecyclerView.L(r).k != 0 ? null : (ExploreSitesCategoryCardView) r;
                    if (exploreSitesCategoryCardView != null && (childAt = exploreSitesCategoryCardView.h.getChildAt(i2)) != null) {
                        childAt.requestFocus();
                    }
                }
            }
        }
        this.F = null;
    }
}
