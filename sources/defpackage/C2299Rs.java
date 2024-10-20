package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import org.chromium.chrome.features.tasks.TasksView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2299Rs extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ ImageView g;

    public C2299Rs(TasksView tasksView, AppCompatImageView appCompatImageView) {
        this.a = tasksView;
        this.g = appCompatImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.removeView(this.g);
    }
}
