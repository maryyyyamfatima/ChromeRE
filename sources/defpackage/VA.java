package defpackage;

import android.app.Activity;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VA implements InterfaceC0679Ff3 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ BookmarkId g;

    public VA(Activity activity, BookmarkId bookmarkId) {
        this.a = activity;
        this.g = bookmarkId;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        FI2.a("EnhancedBookmarks.EditAfterCreateButtonNotClicked");
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        FI2.a("EnhancedBookmarks.EditAfterCreateButtonClicked");
        WA.h(this.a, this.g);
    }
}
