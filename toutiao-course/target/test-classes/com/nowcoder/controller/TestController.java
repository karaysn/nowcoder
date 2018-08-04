package com.nowcoder.controller;

import com.nowcoder.dao.TestDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author liumeng
 * 2017/6/21.
 */
@Controller
public class TestController {

  @Autowired
  private TestDAO testDAO;

  private static String reference = "<div class=\"comment-mod js-server-tab\">\n" +
      "    <div class=\"mod-title clearfix\">\n" + "        <h4>评分参考</h4>\n" + "    </div>\n" +
      "    <div class=\"menu-box js-server-tab-head\">\n" +
      "        <ul class=\"menu clearfix\">\n" +
      "            <li class=\"selected\"><a href=\"\">技术</a></li>\n" +
      "            <li><a href=\"\">非技术</a></li>\n" + "            <li><a href=\"\">产品</a></li>\n" +
      "        </ul>\n" + "    </div>\n" +
      "    <div class=\"js-server-tab-content\" data-round>\n" +
      "        <div class=\"js-server-tab\">\n" +
      "\t        <div class=\"menu-txt-box js-server-tab-head\">\n" +
      "\t            <ul class=\"menu-txt clearfix\">\n" +
      "\t                <li class=\"selected\">\n" +
      "\t                    <a href=\"\">一面</a>\n" + "\t                </li>\n" +
      "\t                <li class=\"menu-pipe\">|</li>\n" + "\t                <li>\n" +
      "\t                    <a href=\"\">二面</a>\n" + "\t                </li>\n" +
      "\t                <li class=\"menu-pipe\">|</li>\n" + "\t                <li>\n" +
      "\t                    <a href=\"\">三面</a>\n" + "\t                </li>\n" +
      "\t            </ul>\n" + "\t        </div>\n" +
      "\t        <div class=\"js-server-tab-content\" data-round>\n" + "\t            <div>\n" +
      "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>技术一面面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>技术基础必问项</th>\n" + "\t\t\t\t            <th>技术基础加分项</th>\n" +
      "\t\t\t\t            <th colspan=\"3\">岗位领域技术加分项</th>\n" + "\t\t\t\t        </tr>\n" +
      "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td rowspan=\"3\">技术要求</td>\n" +
      "\t\t\t\t            <td>编程语言（C/C++,Java,PHP）</td>\n" +
      "\t\t\t\t            <td>网络基础</td>\n" + "\t\t\t\t            <td>Linux Kernel</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>IOS开发/Android</p>\n" +
      "\t\t\t\t                <p>开发/Windows</p>\n" + "\t\t\t\t                <p>开发</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>分布式计</p>\n" + "\t\t\t\t                <p>算（Hado</p>\n" +
      "\t\t\t\t                <p>op，MPI</p>\n" + "\t\t\t\t                <p>等）</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>数据结构与算法</td>\n" + "\t\t\t\t            <td>数据库</td>\n" +
      "\t\t\t\t            <td>TCP/IP协议</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>Web漏洞挖</p>\n" + "\t\t\t\t                <p>掘、Windows</p>\n" +
      "\t\t\t\t                <p>漏洞挖掘</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>JavaScript、</p>\n" +
      "\t\t\t\t                <p>HTML、C</p>\n" + "\t\t\t\t                <p>SS</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>操作系统原理、计算</p>\n" +
      "\t\t\t\t                <p>机组成原理</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>编译原理</td>\n" + "\t\t\t\t            <td>反汇编/逆向</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>测试（黑盒测</p>\n" +
      "\t\t\t\t                <p>试/白盒测试）</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>NLP/机器</p>\n" +
      "\t\t\t\t                <p>学习/数据</p>\n" + "\t\t\t\t                <p>挖掘</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\n" + "\n" +
      "\t\t\t\t<div style=\"display:none;\">\n" + "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>二面面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>解决问题的能力</th>\n" + "\t\t\t\t            <th>创新能力</th>\n" +
      "\t\t\t\t            <th>学习能力</th>\n" + "\t\t\t\t            <th>意愿兴趣</th>\n" +
      "\t\t\t\t            <!--<th colspan=\"3\">岗位领域技术加分项</th>-->\n" + "\t\t\t\t        </tr>\n" +
      "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td rowspan=\"5\">能力要求</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>清晰准确地分</p>\n" +
      "\t\t\t\t                <p>析问题产生的</p>\n" + "\t\t\t\t                <p>原因</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>能主动跟踪行业和技术发展趋势</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>对技术等相关领域</p>\n" +
      "\t\t\t\t                <p>有浓厚的兴趣，能</p>\n" + "\t\t\t\t                <p>够主动学习，而不</p>\n" +
      "\t\t\t\t                <p>仅仅完成课程要求</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>关注求职岗位</p>\n" +
      "\t\t\t\t                <p>领域的新研</p>\n" + "\t\t\t\t                <p>究、新实操</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>分析导致问题</p>\n" +
      "\t\t\t\t                <p>的关键因素，</p>\n" + "\t\t\t\t                <p>并进行合理的</p>\n" +
      "\t\t\t\t                <p>优先排序</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>关注相关领域的论坛、博客等</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>会通过多渠道收集</p>\n" + "\t\t\t\t                <p>信息</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td rowspan=\"2\">\n" +
      "\t\t\t\t                <p>对于某领域有明显</p>\n" + "\t\t\t\t                <p>兴趣，并能够做出具</p>\n" +
      "\t\t\t\t                <p>有一定深度的分析</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>针对导致问题</p>\n" + "\t\t\t\t                <p>的主要原因，</p>\n" +
      "\t\t\t\t                <p>采用针对性的</p>\n" + "\t\t\t\t                <p>方式解决问题</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>用自动化方法代替手式工作</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>对技术细节能够进</p>\n" +
      "\t\t\t\t                <p>行深入研究，知其</p>\n" + "\t\t\t\t                <p>然也知其所以然</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"2\">\n" + "\t\t\t\t                <p>主动寻求更多</p>\n" +
      "\t\t\t\t                <p>问题解决方案</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>能举一反三</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>善于总结，有复盘</p>\n" + "\t\t\t\t                <p>能力</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td rowspan=\"2\">\n" +
      "\t\t\t\t                <p>关心技术话题</p>\n" + "\t\t\t\t                <p>并经常与身边的“同</p>\n" +
      "\t\t\t\t                <p>好者”研究探讨</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>解决问题不拘泥于常规思维</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>可借鉴以往的和他</p>\n" + "\t\t\t\t                <p>人经验解决问题</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\n" + "\n" +
      "\t\t\t\t<div style=\"display:none;\">\n" + "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>HR面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>成就导向</th>\n" + "\t\t\t\t            <th>沟通能力</th>\n" +
      "\t\t\t\t            <th>团队合作</th>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"5\">能力要求</td>\n" +
      "\t\t\t\t            <td>对工作有热情，主动出击</td>\n" +
      "\t\t\t\t            <td>能够自信、自如的发表思考过程和观点</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>相信团队的力</p>\n" + "\t\t\t\t                <p>量，愿意与人</p>\n" +
      "\t\t\t\t                <p>合作</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>设立有挑战性的目标，且努力实现</td>\n" +
      "\t\t\t\t            <td>讲话清晰，流畅，有条理</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>能在新团队中</p>\n" + "\t\t\t\t                <p>快速找到合作</p>\n" +
      "\t\t\t\t                <p>方法</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>主动寻求更多问题解决方案</td>\n" +
      "\t\t\t\t            <td>能够有效倾听，对不确定问题能进一步澄清</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>能够与不同层</p>\n" + "\t\t\t\t                <p>级和部门的人</p>\n" +
      "\t\t\t\t                <p>相互沟通</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>检点自身的问题，承认失误并寻求</p>\n" + "\t\t\t\t                <p>改进</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>有非言语的表情或动作的交流</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>在完成自己工</p>\n" +
      "\t\t\t\t                <p>作的同时愿意</p>\n" + "\t\t\t\t                <p>帮助他人</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>主动分享自己的经验和信息</td>\n" + "\t\t\t\t            <td>具有说服力</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>发生冲突时积</p>\n" +
      "\t\t\t\t                <p>极寻找解决问</p>\n" + "\t\t\t\t                <p>题的方法</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\t        </div>\n" + "        </div>\n" +
      "\n" + "\n" + "        <div class=\"js-server-tab\" style=\"display:none;\">\n" +
      "\t        <div class=\"menu-txt-box js-server-tab-head\">\n" +
      "\t            <ul class=\"menu-txt clearfix\">\n" +
      "\t                <li class=\"selected\">\n" +
      "\t                    <a href=\"\">一面</a>\n" + "\t                </li>\n" +
      "\t                <li class=\"menu-pipe\">|</li>\n" + "\t                <li>\n" +
      "\t                    <a href=\"\">二面</a>\n" + "\t                </li>\n" +
      "\t                <li class=\"menu-pipe\">|</li>\n" + "\t                <li>\n" +
      "\t                    <a href=\"\">三面</a>\n" + "\t                </li>\n" +
      "\t            </ul>\n" + "\t        </div>\n" +
      "\t        <div class=\"js-server-tab-content\" data-round>\n" + "\t            <div>\n" +
      "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>一面面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>技能基础</th>\n" + "\t\t\t\t            <th>逻辑思维能力</th>\n" +
      "\t\t\t\t            <th>产品潜质</th>\n" + "\t\t\t\t            <th>个人品质</th>\n" +
      "\t\t\t\t            <th>加分能力</th>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"5\">技能要求</td>\n" +
      "\t\t\t\t            <td rowspan=\"2\">\n" + "\t\t\t\t                <p>常用软件的使</p>\n" +
      "\t\t\t\t                <p>用深度和广</p>\n" + "\t\t\t\t                <p>度，文档编辑</p>\n" +
      "\t\t\t\t                <p>功力</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t            <p>分析能力（功能</p>\n" +
      "\t\t\t\t            <p>逻辑梳理）</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>细节关注能力</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>自主学习，快速</p>\n" + "\t\t\t\t                <p>学习能力</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>有突出的实践经历</td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t            <p>沟通表达的条</p>\n" + "\t\t\t\t            <p>理性</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>审美能力</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>诚信、乐观、率</p>\n" +
      "\t\t\t\t                <p>真、认真</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>对互联网有深入的</p>\n" +
      "\t\t\t\t                <p>认识和独到的见解</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>需求调研能力</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t             <p>逻辑分析和分级</p>\n" + "\t\t\t\t             <p>能力</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>说服力，推动力</td>\n" +
      "\t\t\t\t            <td>忍耐力和持久力</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>有很好的问题解决</p>\n" + "\t\t\t\t                <p>能力</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>数据分析能力</td>\n" + "\t\t\t\t            <td></td>\n" +
      "\t\t\t\t            <td>想法多，点子多</td>\n" + "\t\t\t\t            <td>百折不挠的精神</td>\n" +
      "\t\t\t\t            <td>是否有技术背景</td>\n" + "\t\t\t\t        </tr>\n" +
      "\t\t\t\t        </tbody>\n" + "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\n" + "\n" +
      "\t\t\t\t<div style=\"display:none;\">\n" + "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>二面面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>解决问题的能力</th>\n" + "\t\t\t\t            <th>创新能力</th>\n" +
      "\t\t\t\t            <th>学习能力</th>\n" + "\t\t\t\t            <th>意愿兴趣</th>\n" +
      "\t\t\t\t            <!--<th colspan=\"3\">岗位领域技术加分项</th>-->\n" + "\t\t\t\t        </tr>\n" +
      "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td rowspan=\"5\">能力要求</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>清晰准确地分</p>\n" +
      "\t\t\t\t                <p>析问题产生的</p>\n" + "\t\t\t\t                <p>原因</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>能主动跟踪行业和技术发展趋势</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>对技术等相关领域</p>\n" +
      "\t\t\t\t                <p>有浓厚的兴趣，能</p>\n" + "\t\t\t\t                <p>够主动学习，而不</p>\n" +
      "\t\t\t\t                <p>仅仅完成课程要求</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>关注求职岗位</p>\n" +
      "\t\t\t\t                <p>领域的新研</p>\n" + "\t\t\t\t                <p>究、新实操</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>分析导致问题</p>\n" +
      "\t\t\t\t                <p>的关键因素，</p>\n" + "\t\t\t\t                <p>并进行合理的</p>\n" +
      "\t\t\t\t                <p>优先排序</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>关注相关领域的信息和渠道</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>会通过多渠道收集</p>\n" + "\t\t\t\t                <p>信息</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td rowspan=\"2\">\n" +
      "\t\t\t\t                <p>对于某领域有明显</p>\n" + "\t\t\t\t                <p>兴趣，并能够做出具</p>\n" +
      "\t\t\t\t                <p>有一定深度的分析</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>针对导致问题</p>\n" + "\t\t\t\t                <p>的主要原因，</p>\n" +
      "\t\t\t\t                <p>采用针对性的</p>\n" + "\t\t\t\t                <p>方式解决问题</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td></td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>对技术细节能够进</p>\n" +
      "\t\t\t\t                <p>行深入研究，知其</p>\n" + "\t\t\t\t                <p>然也知其所以然</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"2\">\n" + "\t\t\t\t                <p>主动寻求更多</p>\n" +
      "\t\t\t\t                <p>问题解决方案</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>能举一反三</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>善于总结，有复盘</p>\n" + "\t\t\t\t                <p>能力</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td rowspan=\"2\">\n" +
      "\t\t\t\t                <p>关心技术话题</p>\n" + "\t\t\t\t                <p>并经常与身边的“同</p>\n" +
      "\t\t\t\t                <p>好者”研究探讨</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>解决问题不拘泥于常规思维</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>可借鉴以往的和他</p>\n" + "\t\t\t\t                <p>人经验解决问题</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\n" + "\n" +
      "\t\t\t\t<div style=\"display:none;\">\n" + "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>HR面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>成就导向</th>\n" + "\t\t\t\t            <th>沟通能力</th>\n" +
      "\t\t\t\t            <th>团队合作</th>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"5\">能力要求</td>\n" +
      "\t\t\t\t            <td>对工作有热情，主动出击</td>\n" +
      "\t\t\t\t            <td>能够自信、自如的发表思考过程和观点</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>相信团队的力</p>\n" + "\t\t\t\t                <p>量，愿意与人</p>\n" +
      "\t\t\t\t                <p>合作</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>设立有挑战性的目标，且努力实现</td>\n" +
      "\t\t\t\t            <td>讲话清晰，流畅，有条理</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>能在新团队中</p>\n" + "\t\t\t\t                <p>快速找到合作</p>\n" +
      "\t\t\t\t                <p>方法</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>主动寻求更多问题解决方案</td>\n" +
      "\t\t\t\t            <td>能够有效倾听，对不确定问题能进一步澄清</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>能够与不同层</p>\n" + "\t\t\t\t                <p>级和部门的人</p>\n" +
      "\t\t\t\t                <p>相互沟通</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>检点自身的问题，承认失误并寻求</p>\n" + "\t\t\t\t                <p>改进</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>有非言语的表情或动作的交流</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>在完成自己工</p>\n" +
      "\t\t\t\t                <p>作的同时愿意</p>\n" + "\t\t\t\t                <p>帮助他人</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>主动分享自己的经验和信息</td>\n" + "\t\t\t\t            <td>具有说服力</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>发生冲突时积</p>\n" +
      "\t\t\t\t                <p>极寻找解决问</p>\n" + "\t\t\t\t                <p>题的方法</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\t        </div>\n" + "        </div>\n" +
      "\n" + "\n" + "        <div class=\"js-server-tab\" style=\"display:none;\">\n" +
      "\t        <div class=\"menu-txt-box js-server-tab-head\">\n" +
      "\t            <ul class=\"menu-txt clearfix\">\n" +
      "\t                <li class=\"selected\">\n" +
      "\t                    <a href=\"\">一面</a>\n" + "\t                </li>\n" +
      "\t                <li class=\"menu-pipe\">|</li>\n" + "\t                <li>\n" +
      "\t                    <a href=\"\">二面</a>\n" + "\t                </li>\n" +
      "\t                <li class=\"menu-pipe\">|</li>\n" + "\t                <li>\n" +
      "\t                    <a href=\"\">三面</a>\n" + "\t                </li>\n" +
      "\t            </ul>\n" + "\t        </div>\n" +
      "\t        <div class=\"js-server-tab-content\" data-round>\n" + "\t            <div>\n" +
      "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>一面面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>成就动力</th>\n" + "\t\t\t\t            <th>沟通能力</th>\n" +
      "\t\t\t\t            <th>团队合作</th>\n" + "\t\t\t\t            <th>问题分析能力</th>\n" +
      "\t\t\t\t            <th>创新能力</th>\n" + "\t\t\t\t            <th>个人加分项</th>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"4\">技能要求</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>关注最终</p>\n" + "\t\t\t\t                <p>目标结果，</p>\n" +
      "\t\t\t\t                <p>为实现目标</p>\n" + "\t\t\t\t                <p>积极努力，</p>\n" +
      "\t\t\t\t                <p>主动参与团</p>\n" + "\t\t\t\t                <p>队工作；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>领会他人立</p>\n" + "\t\t\t\t                <p>场、意图和</p>\n" +
      "\t\t\t\t                <p>需要，预测</p>\n" + "\t\t\t\t                <p>他人的所做</p>\n" +
      "\t\t\t\t                <p>所为，并给</p>\n" + "\t\t\t\t                <p>予及时的反</p>\n" +
      "\t\t\t\t                <p>馈；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>倡导民</p>\n" +
      "\t\t\t\t                <p>主、自由的</p>\n" + "\t\t\t\t                <p>发言气氛，</p>\n" +
      "\t\t\t\t                <p>适时组织大</p>\n" + "\t\t\t\t                <p>家发言，与</p>\n" +
      "\t\t\t\t                <p>他人密切合</p>\n" + "\t\t\t\t                <p>作；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>头脑清晰</p>\n" + "\t\t\t\t                <p>敏锐，能抓</p>\n" +
      "\t\t\t\t                <p>住问题的关</p>\n" + "\t\t\t\t                <p>键所在，思</p>\n" +
      "\t\t\t\t                <p>维敏捷，条</p>\n" + "\t\t\t\t                <p>理清晰，逻</p>\n" +
      "\t\t\t\t                <p>辑严谨；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>有创新意</p>\n" +
      "\t\t\t\t                <p>识，能提出许</p>\n" + "\t\t\t\t                <p>多新颖独特的</p>\n" +
      "\t\t\t\t                <p>想法；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>能够对整个</p>\n" +
      "\t\t\t\t                <p>讨论进行领</p>\n" + "\t\t\t\t                <p>导；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>始终将完</p>\n" +
      "\t\t\t\t                <p>成计划和目</p>\n" + "\t\t\t\t                <p>标放在首</p>\n" +
      "\t\t\t\t                <p>位；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>语言流畅，</p>\n" +
      "\t\t\t\t                <p>语调适宜，</p>\n" + "\t\t\t\t                <p>清晰地表达</p>\n" +
      "\t\t\t\t                <p>观点，找到</p>\n" + "\t\t\t\t                <p>信息和争论</p>\n" +
      "\t\t\t\t                <p>的关键点；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>协调成员</p>\n" +
      "\t\t\t\t                <p>间的不同意</p>\n" + "\t\t\t\t                <p>见，合理概</p>\n" +
      "\t\t\t\t                <p>括总结，促</p>\n" + "\t\t\t\t                <p>成一致意</p>\n" +
      "\t\t\t\t                <p>见，积极推</p>\n" + "\t\t\t\t                <p>进讨论进</p>\n" +
      "\t\t\t\t                <p>程；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>能通过掌</p>\n" +
      "\t\t\t\t                <p>握的信息，</p>\n" + "\t\t\t\t                <p>分析并作出</p>\n" +
      "\t\t\t\t                <p>合理的判</p>\n" + "\t\t\t\t                <p>断，轻松自</p>\n" +
      "\t\t\t\t                <p>如地处理各</p>\n" + "\t\t\t\t                <p>种抽象概念</p>\n" +
      "\t\t\t\t                <p>和复杂的事</p>\n" + "\t\t\t\t                <p>物。</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>关注新信</p>\n" + "\t\t\t\t                <p>息，对新信息</p>\n" +
      "\t\t\t\t                <p>表现出快速的</p>\n" + "\t\t\t\t                <p>理解，并做出</p>\n" +
      "\t\t\t\t                <p>准确判断；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>轻松化解高</p>\n" +
      "\t\t\t\t                <p>度紧张的局</p>\n" + "\t\t\t\t                <p>势，可以在</p>\n" +
      "\t\t\t\t                <p>压力环境下</p>\n" + "\t\t\t\t                <p>保持稳定情</p>\n" +
      "\t\t\t\t                <p>绪，富有成</p>\n" + "\t\t\t\t                <p>效地进行工</p>\n" +
      "\t\t\t\t                <p>作；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t           <td>\n" +
      "\t\t\t\t                <p>具有较强</p>\n" + "\t\t\t\t                <p>的主动性，</p>\n" +
      "\t\t\t\t                <p>充分论证或</p>\n" + "\t\t\t\t                <p>者反驳观</p>\n" +
      "\t\t\t\t                <p>点。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>适时调整策</p>\n" +
      "\t\t\t\t                <p>略，有效影</p>\n" + "\t\t\t\t                <p>响和说服他</p>\n" +
      "\t\t\t\t                <p>人。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>尊重他人</p>\n" +
      "\t\t\t\t                <p>的意见，保</p>\n" + "\t\t\t\t                <p>持愉悦、舒</p>\n" +
      "\t\t\t\t                <p>服的交谈。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td></td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>善于提出自</p>\n" + "\t\t\t\t                <p>己的观点并设</p>\n" +
      "\t\t\t\t                <p>法得到小组成</p>\n" + "\t\t\t\t                <p>员的支持。</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>具有时间观</p>\n" + "\t\t\t\t                <p>念，在必要</p>\n" +
      "\t\t\t\t                <p>时候妥协以</p>\n" + "\t\t\t\t                <p>便小组在规</p>\n" +
      "\t\t\t\t                <p>定时间内达</p>\n" + "\t\t\t\t                <p>成结论。</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\n" + "\n" +
      "\t\t\t\t<div style=\"display:none;\">\n" + "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>二面面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>主动性</th>\n" + "\t\t\t\t            <th>沟通能力</th>\n" +
      "\t\t\t\t            <th>团队合作</th>\n" + "\t\t\t\t            <th>问题分析能力</th>\n" +
      "\t\t\t\t            <th>创新能力</th>\n" +
      "\t\t\t\t            <!--<th colspan=\"3\">岗位领域技术加分项</th>-->\n" + "\t\t\t\t        </tr>\n" +
      "\t\t\t\t        <tr>\n" + "\t\t\t\t            <td rowspan=\"4\">能力要求</td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>关注最终目</p>\n" +
      "\t\t\t\t                <p>标结果，为实</p>\n" + "\t\t\t\t                <p>现目标积极努</p>\n" +
      "\t\t\t\t                <p>力，主动参与</p>\n" + "\t\t\t\t                <p>团队工作；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>领会他人立场、意图和需要，预</p>\n" +
      "\t\t\t\t                <p>测他人的行为，并给予及时的反</p>\n" + "\t\t\t\t                <p>馈；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>倡导民主、自由的发言</p>\n" +
      "\t\t\t\t                <p>气氛，适时组织大家发</p>\n" +
      "\t\t\t\t                <p>言，与他人密切合作；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>头脑清晰敏锐，能</p>\n" +
      "\t\t\t\t                <p>抓住问题的关键所</p>\n" + "\t\t\t\t                <p>在，思维敏捷，条</p>\n" +
      "\t\t\t\t                <p>理清晰，逻辑严谨；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>有创新意识，</p>\n" +
      "\t\t\t\t                <p>能提出许多新颖独</p>\n" + "\t\t\t\t                <p>特的想法；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>始终将完成</p>\n" +
      "\t\t\t\t                <p>计划和目标放</p>\n" + "\t\t\t\t                <p>在首位；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>语言流畅，语调适宜，清晰地表</p>\n" +
      "\t\t\t\t                <p>达观点，找到信息和争论的关键</p>\n" + "\t\t\t\t                <p>点；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>协调成员间的不同意</p>\n" +
      "\t\t\t\t                <p>见，合理概括总结，促成</p>\n" +
      "\t\t\t\t                <p>一致意见，积极推进讨论</p>\n" + "\t\t\t\t                <p>进程；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>能通过掌握的信息，</p>\n" +
      "\t\t\t\t                <p>分析并作出合理的判断，</p>\n" +
      "\t\t\t\t                <p>轻松自如地处理各种抽</p>\n" +
      "\t\t\t\t                <p>象概念和复杂的事物。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>关注新信息，对新</p>\n" +
      "\t\t\t\t                <p>信息表现出快速的理</p>\n" + "\t\t\t\t                <p>解，并做出准确判断；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>具有较强的</p>\n" +
      "\t\t\t\t                <p>主动性，充分</p>\n" + "\t\t\t\t                <p>论证或者反驳</p>\n" +
      "\t\t\t\t                <p>观点。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>适时调整策略，有效影响和说服</p>\n" +
      "\t\t\t\t                <p>他人。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>尊重他人的意见，保持</p>\n" +
      "\t\t\t\t                <p>愉悦、舒服的交谈。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td></td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>善于提出自己的观点并</p>\n" +
      "\t\t\t\t                <p>设法得到小组成员的支持。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" + "\t\t\t\t    </table>\n" +
      "\t\t\t\t</div>\n" + "\n" + "\n" + "\t\t\t\t<div style=\"display:none;\">\n" +
      "\t\t\t\t    <table class=\"score-standard\">\n" +
      "\t\t\t\t        <caption>HR面试官主要所提问题及回答中的突出点或需特别关注的点</caption>\n" +
      "\t\t\t\t        <tbody>\n" + "\t\t\t\t        <tr>\n" + "\t\t\t\t            <th></th>\n" +
      "\t\t\t\t            <th>职位匹配性</th>\n" + "\t\t\t\t            <th>成就动机</th>\n" +
      "\t\t\t\t            <th>沟通协调</th>\n" + "\t\t\t\t            <th>合作意识</th>\n" +
      "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td rowspan=\"3\">能力要求</td>\n" + "\t\t\t\t            <td>\n" +
      "\t\t\t\t                <p>对待工作认真负责，敢于担</p>\n" +
      "\t\t\t\t                <p>当，对自我发展有清晰的认</p>\n" +
      "\t\t\t\t                <p>识，自我认知客观求实；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>主动为自己设立工作目标，面对</p>\n" +
      "\t\t\t\t                <p>困难不退缩，敢于迎接挑战；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>有较强的人</p>\n" +
      "\t\t\t\t                <p>际敏感性，能</p>\n" + "\t\t\t\t                <p>准确理解他人</p>\n" +
      "\t\t\t\t                <p>的情绪感受，</p>\n" + "\t\t\t\t                <p>并灵活调整个</p>\n" +
      "\t\t\t\t                <p>人行为；</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>善于倾听他人意见，</p>\n" +
      "\t\t\t\t                <p>在团队中能主动交流，</p>\n" +
      "\t\t\t\t                <p>有利于形成融洽的团队</p>\n" + "\t\t\t\t                <p>氛围；</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        <tr>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>个人的经历、特点与产品岗</p>\n" +
      "\t\t\t\t                <p>位具有较强的匹配性。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>对互联网技术和互联网产品有浓</p>\n" +
      "\t\t\t\t                <p>厚的兴趣和深入的了解，关注新产</p>\n" +
      "\t\t\t\t                <p>品、新研究。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>沟通能力较</p>\n" +
      "\t\t\t\t                <p>强，能够通过</p>\n" + "\t\t\t\t                <p>多方交流和协</p>\n" +
      "\t\t\t\t                <p>调，整合资</p>\n" + "\t\t\t\t                <p>源，顺利地完</p>\n" +
      "\t\t\t\t                <p>成工作任务。</p>\n" + "\t\t\t\t            </td>\n" +
      "\t\t\t\t            <td>\n" + "\t\t\t\t                <p>愿意和他人合作，富有合作</p>\n" +
      "\t\t\t\t                <p>意识，愿意作为团队成员</p>\n" +
      "\t\t\t\t                <p>共同解决问题，尊重</p>\n" + "\t\t\t\t                <p>欣赏团队成员的贡献。</p>\n" +
      "\t\t\t\t            </td>\n" + "\t\t\t\t        </tr>\n" + "\t\t\t\t        </tbody>\n" +
      "\t\t\t\t    </table>\n" + "\t\t\t\t</div>\n" + "\t        </div>\n" + "        </div>\n" +
      "    </div>\n" + "</div>";

  @RequestMapping(path = {"/test/refer"}, method = {RequestMethod.GET, RequestMethod.POST})
  @ResponseBody
  public String test() {
    testDAO.updateLikeCount(30, reference);
    return "OK";
  }

}
