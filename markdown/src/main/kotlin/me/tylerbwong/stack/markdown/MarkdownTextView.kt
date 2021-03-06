package me.tylerbwong.stack.markdown

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import dagger.hilt.android.AndroidEntryPoint
import me.saket.bettermovementmethod.BetterLinkMovementMethod
import javax.inject.Inject

@AndroidEntryPoint
class MarkdownTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    @Inject
    lateinit var markdown: Markdown

    init {
        setTextIsSelectable(true)
        movementMethod = BetterLinkMovementMethod.getInstance()
    }

    fun setMarkdown(text: String) = markdown.setMarkdown(this, text)
}
