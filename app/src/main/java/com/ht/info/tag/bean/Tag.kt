package com.ht.info.tag.bean


data class Tag(val name: String, val type: Int, val tagData: TagData)

/**
 * id:唯一id
 * type:类型(文本,url,图片)
 * content:类型对应的内容
 * reminder:提醒
 */
data class TagData(val id: Int, val type: Int, val content: String, val reminder: TagReminder)

/**
 * reminderTime:提醒时间
 * scheduleTime:周期间隔(如果是周期任务,间隔)
 * status:状态(有效,过期)
 */
data class TagReminder(val reminderTime: Long, val scheduleTime: Long, val status: Int)