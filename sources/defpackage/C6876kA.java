package defpackage;

import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kA */
/* loaded from: classes.dex */
public final class C6876kA extends C7526m33 {
    public final /* synthetic */ C8252oA e;

    public C6876kA(C8252oA c8252oA) {
        this.e = c8252oA;
    }

    @Override // defpackage.C7526m33
    public final boolean g(Object obj) {
        BookmarkId bookmarkId = (BookmarkId) obj;
        C8252oA c8252oA = this.e;
        if (c8252oA.i.f(bookmarkId) == null || c8252oA.i.f(bookmarkId).a()) {
            return super.g(bookmarkId);
        }
        return false;
    }
}
